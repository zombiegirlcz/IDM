package wl3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class e implements kfm.g, kfm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f298377b;

    public e(int i, Function1 function) {
        this.f298376a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f298377b = function;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f298377b = function;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f298377b = function;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f298377b = function;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f298377b = function;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f298377b = function;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f298377b = function;
                break;
            case 8:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f298377b = function;
                break;
            case 9:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f298377b = function;
                break;
            default:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f298377b = function;
                break;
        }
    }

    @Override // kfm.g
    public /* synthetic */ void accept(Object obj2) {
        switch (this.f298376a) {
            case 0:
                this.f298377b.invoke(obj2);
                break;
            case 1:
                this.f298377b.invoke(obj2);
                break;
            case 2:
                this.f298377b.invoke(obj2);
                break;
            case 3:
                this.f298377b.invoke(obj2);
                break;
            case 4:
            default:
                this.f298377b.invoke(obj2);
                break;
            case 5:
                this.f298377b.invoke(obj2);
                break;
            case 6:
                this.f298377b.invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f298376a) {
        }
        return this.f298377b.invoke(obj2);
    }
}
