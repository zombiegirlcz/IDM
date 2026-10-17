package com.fourthline.core.internal;

import com.fourthline.core.internal.t;
import com.fourthline.core.mrz.MrzInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes23.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f26392b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f26393a = new e();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f26394a = new b("MRTD", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f26395b = new b("IDL", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f26396c;
        private static final /* synthetic */ EnumEntries d;

        static {
            b[] bVarArrA = a();
            f26396c = bVarArrA;
            d = vc.s.n(bVarArrA);
        }

        private b(String str, int i) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f26394a, f26395b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f26396c.clone();
        }
    }

    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f26394a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f26395b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final z a(String str, b bVar) throws t.a {
        int i = c.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (str.length() == 30) {
                return new l(str);
            }
            throw t.a.f26397a;
        }
        int length = str.length();
        if (length == 72) {
            return a(str) ? new h(str) : new f0(str);
        }
        if (length == 88) {
            return new h0(str);
        }
        if (length == 90) {
            return new d0(str);
        }
        throw t.a.f26397a;
    }

    public final MrzInfo b(String from) throws t.a {
        b bVar;
        Intrinsics.checkNotNullParameter(from, "from");
        String strA = this.f26393a.a(from);
        if (new p(strA).b()) {
            bVar = b.f26394a;
        } else {
            if (!new j(strA).b()) {
                throw t.a.f26397a;
            }
            bVar = b.f26395b;
        }
        z zVarA = a(this.f26393a.b(strA), bVar);
        i0 i0VarB = b(bVar);
        m mVarA = a(bVar);
        y yVarA = zVarA.a();
        return mVarA.a(yVarA, i0VarB.a(yVarA), strA);
    }

    private final m a(b bVar) {
        int i = c.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i == 1) {
            return new o();
        }
        if (i == 2) {
            return new i();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final i0 b(b bVar) {
        int i = c.$EnumSwitchMapping$0[bVar.ordinal()];
        com.fourthline.core.internal.c cVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        int i2 = 1;
        if (i != 1) {
            if (i == 2) {
                return new k(cVar, i2, objArr4 == true ? 1 : 0);
            }
            throw new NoWhenBranchMatchedException();
        }
        return new q(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
    }

    private final boolean a(String str) {
        return Intrinsics.f(kotlin.text.d0.t0(str, new IntRange(0, 4, 1)), "IDFRA");
    }
}
