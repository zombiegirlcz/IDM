package com.fourthline.orca.internal;

import com.fourthline.orca.internal.r10;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface z10 extends z00 {

    public static final class a implements z10 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f35480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final r10.b f35481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final r10 f35482c;

        public a(File file, r10.b type, r10 r10Var) {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f35480a = file;
            this.f35481b = type;
            this.f35482c = r10Var;
        }

        public final File b() {
            return this.f35480a;
        }

        public final r10.b c() {
            return this.f35481b;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f35480a, aVar.f35480a) && this.f35481b == aVar.f35481b && this.f35482c == aVar.f35482c;
        }

        @Override // com.fourthline.orca.internal.z10
        public r10 getKey() {
            return this.f35482c;
        }

        public int hashCode() {
            int iHashCode = ((this.f35480a.hashCode() * 31) + this.f35481b.hashCode()) * 31;
            r10 r10Var = this.f35482c;
            return iHashCode + (r10Var == null ? 0 : r10Var.hashCode());
        }

        public String toString() {
            return "FromLocalFile(file=" + this.f35480a + ", type=" + this.f35481b + ", key=" + this.f35482c + ")";
        }
    }

    r10 getKey();

    public static final class b implements z10 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f35483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final r10 f35484b;

        public b(int i, r10 r10Var) {
            this.f35483a = i;
            this.f35484b = r10Var;
        }

        public final int b() {
            return this.f35483a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return this.f35483a == bVar.f35483a && this.f35484b == bVar.f35484b;
        }

        @Override // com.fourthline.orca.internal.z10
        public r10 getKey() {
            return this.f35484b;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f35483a) * 31;
            r10 r10Var = this.f35484b;
            return iHashCode + (r10Var == null ? 0 : r10Var.hashCode());
        }

        public String toString() {
            return "FromRawResources(res=" + this.f35483a + ", key=" + this.f35484b + ")";
        }

        public /* synthetic */ b(int i, r10 r10Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : r10Var);
        }
    }
}
