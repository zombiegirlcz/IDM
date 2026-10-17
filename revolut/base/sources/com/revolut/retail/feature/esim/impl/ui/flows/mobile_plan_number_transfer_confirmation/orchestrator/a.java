package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator;

import aii.r;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a implements r {

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f100765a = new b();

        private b() {
        }
    }

    private a() {
    }

    /* JADX INFO: renamed from: com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a$a, reason: collision with other inner class name */
    public static final class C0612a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f100764a;

        public C0612a(boolean z) {
            this.f100764a = z;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C0612a) && this.f100764a == ((C0612a) obj2).f100764a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f100764a);
        }

        public C0612a() {
            this(false);
        }
    }
}
