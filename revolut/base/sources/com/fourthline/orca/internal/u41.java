package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes23.dex */
public interface u41 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f33954b = new a("MoveToTheNextStep", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f33955c = new a("HandledInternally", 1);
        private static final /* synthetic */ a[] d;
        private static final /* synthetic */ EnumEntries e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private fo f33956a;

        static {
            a[] aVarArrA = a();
            d = aVarArrA;
            e = vc.s.n(aVarArrA);
        }

        private a(String str, int i) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f33954b, f33955c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }

        public final fo b() {
            return this.f33956a;
        }

        public final void a(fo foVar) {
            this.f33956a = foVar;
        }
    }

    Object a(dp dpVar, g51 g51Var, Continuation continuation);

    default void reset() {
    }
}
