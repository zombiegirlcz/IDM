package e0f;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class n implements kfm.o, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f121647b;

    public n(int i, Function1 function) {
        this.f121646a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f121647b = function;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f121647b = function;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f121647b = function;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f121647b = function;
                break;
            default:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f121647b = function;
                break;
        }
    }

    @Override // kfm.g
    public /* synthetic */ void accept(Object obj2) {
        switch (this.f121646a) {
            case 2:
                this.f121647b.invoke(obj2);
                break;
            case 3:
                this.f121647b.invoke(obj2);
                break;
            default:
                this.f121647b.invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f121646a) {
        }
        return this.f121647b.invoke(obj2);
    }
}
