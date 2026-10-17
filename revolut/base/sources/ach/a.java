package ach;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m1h.d;
import m1h.e;
import m1h.f;
import m1h.g;
import vkm.i;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements m1h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f3138a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0011a f3139b = new C0011a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f3140c = new b();

    /* JADX INFO: renamed from: ach.a$a, reason: collision with other inner class name */
    public static final class C0011a implements d {
        @Override // m1h.d
        public final Clause a(m1h.b disclaimer) {
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            return null;
        }
    }

    public static final class b extends e {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return Unit.f186387a;
        }
    }

    public static final class c implements g {
        @Override // m1h.g
        public final Flow a(f input) {
            Intrinsics.checkNotNullParameter(input, "input");
            return i.f290039a;
        }
    }

    private a() {
    }

    @Override // m1h.c
    public final d a() {
        return f3139b;
    }

    @Override // m1h.c
    public final e b() {
        return f3140c;
    }

    @Override // m1h.c
    public final g q() {
        return f3138a;
    }
}
