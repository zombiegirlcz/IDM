package twl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class o implements kfm.g, kfm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f275064b;

    public o(int i, Function1 function) {
        this.f275063a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f275064b = function;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f275064b = function;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f275064b = function;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f275064b = function;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f275064b = function;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f275064b = function;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f275064b = function;
                break;
            case 8:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f275064b = function;
                break;
            case 9:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f275064b = function;
                break;
            case 10:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f275064b = function;
                break;
            case 11:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f275064b = function;
                break;
            case 12:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f275064b = function;
                break;
            case 13:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f275064b = function;
                break;
            default:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f275064b = function;
                break;
        }
    }

    @Override // kfm.g
    public /* synthetic */ void accept(Object obj2) {
        switch (this.f275063a) {
            case 0:
                this.f275064b.invoke(obj2);
                break;
            case 1:
                this.f275064b.invoke(obj2);
                break;
            case 2:
                this.f275064b.invoke(obj2);
                break;
            case 3:
                this.f275064b.invoke(obj2);
                break;
            case 4:
                this.f275064b.invoke(obj2);
                break;
            case 5:
                this.f275064b.invoke(obj2);
                break;
            case 6:
                this.f275064b.invoke(obj2);
                break;
            case 7:
            case 9:
            case 11:
            default:
                this.f275064b.invoke(obj2);
                break;
            case 8:
                this.f275064b.invoke(obj2);
                break;
            case 10:
                this.f275064b.invoke(obj2);
                break;
            case 12:
                this.f275064b.invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f275063a) {
        }
        return this.f275064b.invoke(obj2);
    }
}
