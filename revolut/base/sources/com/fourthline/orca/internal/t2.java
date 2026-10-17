package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class t2 extends kh0 {

    public static final class a extends t2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final kh0 f33180a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kh0 error) {
            super("selection_unsupported", error, null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f33180a = error;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f33180a, ((a) obj2).f33180a);
        }

        public int hashCode() {
            return this.f33180a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "SelectionUnsupported(error=" + this.f33180a + ")";
        }
    }

    public /* synthetic */ t2(String str, Throwable th10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th10);
    }

    private t2(String str, Throwable th10) {
        super(str, th10, "base_selector_error");
    }
}
