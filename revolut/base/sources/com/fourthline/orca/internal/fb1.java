package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface fb1 extends be1 {

    public static final class a implements fb1 {
    }

    public static final class b implements fb1 {
    }

    public static final class c implements fb1 {
    }

    public static final class d implements fb1 {
    }

    public static final class e implements fb1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f28408a;

        public e(Object obj2) {
            this.f28408a = obj2;
        }

        public final Object a() {
            return this.f28408a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof e) && Intrinsics.f(this.f28408a, ((e) obj2).f28408a);
        }

        public int hashCode() {
            Object obj2 = this.f28408a;
            if (obj2 == null) {
                return 0;
            }
            return obj2.hashCode();
        }

        public String toString() {
            return "OnTypeClicked(type=" + this.f28408a + ")";
        }
    }
}
