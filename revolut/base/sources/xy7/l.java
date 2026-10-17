package xy7;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements kfm.o, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f309638b;

    public l(int i, Function1 function) {
        this.f309637a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f309638b = function;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f309638b = function;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f309638b = function;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f309638b = function;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f309638b = function;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f309638b = function;
                break;
            default:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f309638b = function;
                break;
        }
    }

    @Override // kfm.g
    public /* synthetic */ void accept(Object obj2) {
        switch (this.f309637a) {
            case 2:
                this.f309638b.invoke(obj2);
                break;
            case 3:
                this.f309638b.invoke(obj2);
                break;
            default:
                this.f309638b.invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f309637a) {
        }
        return this.f309638b.invoke(obj2);
    }
}
