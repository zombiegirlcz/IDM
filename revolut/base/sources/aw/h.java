package aw;

import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class h implements Observer, kotlin.jvm.internal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10161a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f10162b;

    public h(auj.o function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f10162b = function;
    }

    public final boolean equals(Object obj2) {
        switch (this.f10161a) {
            case 0:
                if ((obj2 instanceof Observer) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            case 1:
                if ((obj2 instanceof Observer) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            case 2:
                if ((obj2 instanceof Observer) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            case 3:
                if ((obj2 instanceof Observer) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            default:
                if ((obj2 instanceof Observer) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
        }
        return Intrinsics.f(getFunctionDelegate(), ((kotlin.jvm.internal.n) obj2).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.n
    public final Function getFunctionDelegate() {
        switch (this.f10161a) {
            case 0:
                return (auj.o) this.f10162b;
            case 1:
                return (auj.o) this.f10162b;
            case 2:
                return (c2m.b) this.f10162b;
            case 3:
                return (n2m.e) this.f10162b;
            default:
                return (js7.c) this.f10162b;
        }
    }

    public final int hashCode() {
        switch (this.f10161a) {
            case 0:
                return getFunctionDelegate().hashCode();
            case 1:
                return getFunctionDelegate().hashCode();
            case 2:
                return ((c2m.b) this.f10162b).hashCode();
            case 3:
                return ((n2m.e) this.f10162b).hashCode();
            default:
                return ((js7.c) this.f10162b).hashCode();
        }
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj2) {
        switch (this.f10161a) {
            case 0:
                ((auj.o) this.f10162b).invoke(obj2);
                break;
            case 1:
                ((auj.o) this.f10162b).invoke(obj2);
                break;
            case 2:
                ((c2m.b) this.f10162b).invoke(obj2);
                break;
            case 3:
                ((n2m.e) this.f10162b).invoke(obj2);
                break;
            default:
                ((js7.c) this.f10162b).invoke(obj2);
                break;
        }
    }

    public h(auj.o function, byte b4) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f10162b = function;
    }

    public h(c2m.b function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f10162b = function;
    }

    public h(n2m.e function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f10162b = function;
    }

    public h(js7.c function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f10162b = function;
    }
}
