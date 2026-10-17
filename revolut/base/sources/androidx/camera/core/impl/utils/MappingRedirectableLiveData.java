package androidx.camera.core.impl.utils;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import b0.d;
import e0.h;
import eu7.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B#\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\f\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bJ,\u0010\u000e\u001a\u00020\r\"\u0004\b\u0002\u0010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u000b2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u000f0\u0012H\u0016J\u000f\u0010\u0013\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0002\u0010\u0014R\u0010\u0010\u0004\u001a\u00028\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/camera/core/impl/utils/MappingRedirectableLiveData;", "I", "O", "Landroidx/lifecycle/MediatorLiveData;", "initialValue", "mapFunction", "Landroidx/arch/core/util/Function;", "<init>", "(Ljava/lang/Object;Landroidx/arch/core/util/Function;)V", "Ljava/lang/Object;", "liveDataSource", "Landroidx/lifecycle/LiveData;", "redirectTo", "", "addSource", "S", "source", "onChanged", "Landroidx/lifecycle/Observer;", "getValue", "()Ljava/lang/Object;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class MappingRedirectableLiveData<I, O> extends MediatorLiveData<O> {
    private final O initialValue;
    private LiveData<I> liveDataSource;

    @NotNull
    private final Function<I, O> mapFunction;

    public MappingRedirectableLiveData(O o, @NotNull Function<I, O> mapFunction) {
        Intrinsics.checkNotNullParameter(mapFunction, "mapFunction");
        this.initialValue = o;
        this.mapFunction = mapFunction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void redirectTo$lambda$0(LiveData liveData, MappingRedirectableLiveData mappingRedirectableLiveData, LiveData liveData2) {
        if (liveData != null) {
            super.removeSource(liveData);
        }
        super.addSource(liveData2, new h(new c(mappingRedirectableLiveData, 23), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit redirectTo$lambda$0$0(MappingRedirectableLiveData mappingRedirectableLiveData, Object obj2) {
        mappingRedirectableLiveData.setValue(mappingRedirectableLiveData.mapFunction.apply(obj2));
        return Unit.f186387a;
    }

    @Override // androidx.lifecycle.MediatorLiveData
    public <S> void addSource(@NotNull LiveData<S> source, @NotNull Observer<? super S> onChanged) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.lifecycle.LiveData
    public O getValue() {
        LiveData<I> liveData = this.liveDataSource;
        return liveData == null ? this.initialValue : this.mapFunction.apply(liveData.getValue());
    }

    public final void redirectTo(@NotNull LiveData<I> liveDataSource) {
        Intrinsics.checkNotNullParameter(liveDataSource, "liveDataSource");
        LiveData<I> liveData = this.liveDataSource;
        this.liveDataSource = liveDataSource;
        Threads.runOnMain(new d(liveData, 7, this, liveDataSource));
    }
}
