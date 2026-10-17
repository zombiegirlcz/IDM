package com.fourthline.orca.internal;

import com.fourthline.core.mrz.MrzInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface tg {

    public static final class a implements tg {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final kn f33770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final gg0 f33771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f33772c;
        private final MrzInfo d;
        private final List e;

        public a(kn knVar, gg0 gg0Var, String str, MrzInfo mrzInfo, List validationErrors) {
            Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
            this.f33770a = knVar;
            this.f33771b = gg0Var;
            this.f33772c = str;
            this.d = mrzInfo;
            this.e = validationErrors;
        }

        public final kn a() {
            return this.f33770a;
        }

        public final MrzInfo b() {
            return this.d;
        }

        public final gg0 c() {
            return this.f33771b;
        }

        public final String d() {
            return this.f33772c;
        }

        public final List e() {
            return this.e;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f33770a, aVar.f33770a) && Intrinsics.f(this.f33771b, aVar.f33771b) && Intrinsics.f(this.f33772c, aVar.f33772c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
        }

        public int hashCode() {
            kn knVar = this.f33770a;
            int iHashCode = (knVar == null ? 0 : knVar.hashCode()) * 31;
            gg0 gg0Var = this.f33771b;
            int iHashCode2 = (iHashCode + (gg0Var == null ? 0 : gg0Var.hashCode())) * 31;
            String str = this.f33772c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            MrzInfo mrzInfo = this.d;
            return ((iHashCode3 + (mrzInfo != null ? mrzInfo.hashCode() : 0)) * 31) + this.e.hashCode();
        }

        public String toString() {
            return "AnalysedDocument(documentRecognitionData=" + this.f33770a + ", ocr=" + this.f33771b + ", rawMrz=" + this.f33772c + ", mrzInfo=" + this.d + ", validationErrors=" + this.e + ")";
        }
    }

    public static final class b implements tg {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Throwable f33773a;

        public b(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f33773a = error;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f33773a, ((b) obj2).f33773a);
        }

        public int hashCode() {
            return this.f33773a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.f33773a + ")";
        }
    }
}
