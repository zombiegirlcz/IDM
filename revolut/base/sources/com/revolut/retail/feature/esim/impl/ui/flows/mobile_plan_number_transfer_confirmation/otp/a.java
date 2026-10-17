package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp;

import aii.r;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a implements r {

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f100780a = new b();

        private b() {
        }
    }

    private a() {
    }

    /* JADX INFO: renamed from: com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.a$a, reason: collision with other inner class name */
    public static final class C0613a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f100779a;

        public C0613a(boolean z) {
            this.f100779a = z;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C0613a) && this.f100779a == ((C0613a) obj2).f100779a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f100779a);
        }

        public C0613a() {
            this(false);
        }
    }
}
