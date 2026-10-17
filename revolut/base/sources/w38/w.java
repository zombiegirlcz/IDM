package w38;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w implements kfm.o, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f294231b;

    public /* synthetic */ w(int i, Function1 function1) {
        this.f294230a = i;
        this.f294231b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f294230a) {
            case 4:
                this.f294231b.invoke(obj2);
                break;
            case 5:
            case 6:
            case 7:
            default:
                this.f294231b.invoke(obj2);
                break;
            case 8:
                this.f294231b.invoke(obj2);
                break;
            case 9:
                this.f294231b.invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f294230a) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 4:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return (Data) this.f294231b.invoke(p0);
    }
}
