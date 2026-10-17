package gn;

import kfm.g;
import kfm.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements g, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f144890b;

    public b(int i, Function1 function) {
        this.f144889a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f144890b = function;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f144890b = function;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f144890b = function;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f144890b = function;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f144890b = function;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f144890b = function;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f144890b = function;
                break;
            case 8:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f144890b = function;
                break;
            case 9:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f144890b = function;
                break;
            case 10:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f144890b = function;
                break;
            case 11:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f144890b = function;
                break;
            case 12:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f144890b = function;
                break;
            default:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f144890b = function;
                break;
        }
    }

    @Override // kfm.g
    public /* synthetic */ void accept(Object obj2) {
        switch (this.f144889a) {
            case 0:
                this.f144890b.invoke(obj2);
                break;
            case 1:
            case 3:
            case 5:
            case 6:
            case 8:
            default:
                this.f144890b.invoke(obj2);
                break;
            case 2:
                this.f144890b.invoke(obj2);
                break;
            case 4:
                this.f144890b.invoke(obj2);
                break;
            case 7:
                this.f144890b.invoke(obj2);
                break;
            case 9:
                this.f144890b.invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f144889a) {
        }
        return this.f144890b.invoke(obj2);
    }
}
