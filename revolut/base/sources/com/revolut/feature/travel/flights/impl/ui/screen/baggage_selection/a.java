package com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f93249a = new b();

        private b() {
        }
    }

    private a() {
    }

    /* JADX INFO: renamed from: com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.a$a, reason: collision with other inner class name */
    public static final class C0564a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f93248a;

        public C0564a(boolean z) {
            this.f93248a = z;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C0564a) && this.f93248a == ((C0564a) obj2).f93248a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f93248a);
        }

        public C0564a() {
            this(false);
        }
    }
}
