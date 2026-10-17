package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface rc0 extends ee1 {

    public static final class a implements rc0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32686a = new a();

        private a() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return -1875097321;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class b implements rc0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32687a = new b();

        private b() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return -1009475435;
        }

        public String toString() {
            return "Forward";
        }
    }

    public static final class c implements rc0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final wb0 f32688a;

        public c(wb0 flowAction) {
            Intrinsics.checkNotNullParameter(flowAction, "flowAction");
            this.f32688a = flowAction;
        }

        public final wb0 c() {
            return this.f32688a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.f32688a, ((c) obj2).f32688a);
        }

        public int hashCode() {
            return this.f32688a.hashCode();
        }

        public String toString() {
            return "Skip(flowAction=" + this.f32688a + ")";
        }
    }
}
