package com.fourthline.orca.internal;

import java.io.File;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface p70 extends z00 {
    Pair a();

    public static final class a implements p70 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f31875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Pair f31876b;

        public a(File file, Pair pair) {
            Intrinsics.checkNotNullParameter(file, "file");
            this.f31875a = file;
            this.f31876b = pair;
        }

        @Override // com.fourthline.orca.internal.p70
        public Pair a() {
            return this.f31876b;
        }

        public final File b() {
            return this.f31875a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f31875a, aVar.f31875a) && Intrinsics.f(this.f31876b, aVar.f31876b);
        }

        public int hashCode() {
            int iHashCode = this.f31875a.hashCode() * 31;
            Pair pair = this.f31876b;
            return iHashCode + (pair == null ? 0 : pair.hashCode());
        }

        public String toString() {
            return "FromLocalFile(file=" + this.f31875a + ", playRange=" + this.f31876b + ")";
        }

        public /* synthetic */ a(File file, Pair pair, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(file, (i & 2) != 0 ? null : pair);
        }
    }

    public static final class b implements p70 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f31877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Pair f31878b;

        public b(int i, Pair pair) {
            this.f31877a = i;
            this.f31878b = pair;
        }

        @Override // com.fourthline.orca.internal.p70
        public Pair a() {
            return this.f31878b;
        }

        public final int b() {
            return this.f31877a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return this.f31877a == bVar.f31877a && Intrinsics.f(this.f31878b, bVar.f31878b);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f31877a) * 31;
            Pair pair = this.f31878b;
            return iHashCode + (pair == null ? 0 : pair.hashCode());
        }

        public String toString() {
            return "FromRawResources(animationRes=" + this.f31877a + ", playRange=" + this.f31878b + ")";
        }

        public /* synthetic */ b(int i, Pair pair, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : pair);
        }
    }
}
