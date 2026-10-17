package com.fourthline.orca.internal;

import java.util.Iterator;
import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class fd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f28420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fd0 f28421b = new fd0("TopLeft", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fd0 f28422c = new fd0("TopRight", 1);
    public static final fd0 d = new fd0("TopMiddle", 2);
    public static final fd0 e = new fd0("CenterLeft", 3);
    public static final fd0 f = new fd0("CenterMiddle", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final fd0 f28423g = new fd0("CenterRight", 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final fd0 f28424h = new fd0("BottomLeft", 6);
    public static final fd0 i = new fd0("BottomMiddle", 7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final fd0 f28425j = new fd0("BottomRight", 8);
    private static final /* synthetic */ fd0[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f28426l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final fd0 a(String value) {
            Object next;
            Intrinsics.checkNotNullParameter(value, "value");
            Iterator<E> it8 = fd0.b().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((fd0) next).name(), value)) {
                    break;
                }
            }
            fd0 fd0Var = (fd0) next;
            if (fd0Var != null) {
                return fd0Var;
            }
            String lowerCase = value.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -1480325582) {
                if (iHashCode != -1364013995) {
                    if (iHashCode == 115029 && lowerCase.equals("top")) {
                        return fd0.d;
                    }
                } else if (lowerCase.equals("center")) {
                    return fd0.f;
                }
            } else if (lowerCase.equals("abovecenter")) {
                return fd0.d;
            }
            return null;
        }

        private a() {
        }
    }

    static {
        fd0[] fd0VarArrA = a();
        k = fd0VarArrA;
        f28426l = vc.s.n(fd0VarArrA);
        f28420a = new a(null);
    }

    private fd0(String str, int i2) {
    }

    private static final /* synthetic */ fd0[] a() {
        return new fd0[]{f28421b, f28422c, d, e, f, f28423g, f28424h, i, f28425j};
    }

    public static EnumEntries b() {
        return f28426l;
    }

    public static fd0 valueOf(String str) {
        return (fd0) Enum.valueOf(fd0.class, str);
    }

    public static fd0[] values() {
        return (fd0[]) k.clone();
    }
}
