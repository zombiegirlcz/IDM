package dz7;

import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.revolut.data.model.Data;
import com.revolut.feature.selfserve.sow.impl.ui.note.SowNoteFragment;
import com.revolut.retail.core.navigation.NaviCommand;
import d27.g0;
import efm.h0;
import efm.w;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements kfm.o, CallbackToFutureAdapter.Resolver, kfm.g, kfm.c, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f121276b;

    public /* synthetic */ l(Object obj2, int i) {
        this.f121275a = i;
        this.f121276b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f121275a) {
            case 4:
                ((dug.a) this.f121276b).invoke(obj2);
                break;
            case 13:
                ((e05.d) this.f121276b).invoke(obj2);
                break;
            default:
                ((g0) this.f121276b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f121275a;
        Object obj2 = this.f121276b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((j) obj2).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((av8.o) obj2).invoke(p0);
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 10:
            case 13:
            case 14:
            case 17:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((e0f.j) obj2).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Iterable) ((k) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((k) obj2).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((doe.c) obj2).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((e05.d) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((dkm.a) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((e08.a) obj2).invoke(p0);
            case 16:
                return (NaviCommand) ((dug.a) obj2).invoke(p0);
            case 18:
                int i2 = SowNoteFragment.g0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CharSequence) ((k) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((e0d.g) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((e0d.g) obj2).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((e0f.a) obj2).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((e0f.a) obj2).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((k) obj2).invoke(p0);
                return pfm.m.f235744a;
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((e0f.a) obj2).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((e0f.b) obj2).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((k) obj2).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((doe.c) obj2).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((k) obj2).invoke(p0);
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f121275a) {
            case 2:
                return ((CameraRepository) this.f121276b).lambda$deinit$0(completer);
            default:
                return ((LiveDataObservable) this.f121276b).lambda$fetchData$1(completer);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f121275a) {
            case 7:
                k kVar = (k) this.f121276b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) kVar.invoke(p0)).booleanValue();
            case 8:
            case 9:
            default:
                k kVar2 = (k) this.f121276b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) kVar2.invoke(p0)).booleanValue();
            case 10:
                dkm.a aVar = (dkm.a) this.f121276b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) aVar.invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        dug.d dVar = (dug.d) this.f121276b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (Pair) dVar.invoke(p0, p17);
    }
}
