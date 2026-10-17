package hbb;

import com.revolut.feature.backgroundpicker.api.model.PersistedBackground;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f150638a = new a();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        PersistedBackground it8 = (PersistedBackground) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.f63743a;
    }
}
