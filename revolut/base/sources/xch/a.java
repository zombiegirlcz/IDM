package xch;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import t1h.d;
import t1h.e;
import t1h.f;
import vkm.i;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements t1h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f304134a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1692a f304135b = new C1692a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f304136c = new b();

    /* JADX INFO: renamed from: xch.a$a, reason: collision with other inner class name */
    public static final class C1692a implements d {
        @Override // t1h.d
        public final List a(t1h.b disclaimer) {
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            return f0.f322471a;
        }
    }

    public static final class b extends e {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            lpc.c parcel = (lpc.c) obj2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return Unit.f186387a;
        }
    }

    public static final class c implements f {
        @Override // t1h.f
        public final Flow a() {
            return i.f290039a;
        }
    }

    private a() {
    }

    @Override // t1h.c
    public final d a() {
        return f304135b;
    }

    @Override // t1h.c
    public final e b() {
        return f304136c;
    }

    @Override // t1h.c
    public final f q() {
        return f304134a;
    }
}
