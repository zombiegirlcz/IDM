package com.fourthline.orca.internal;

import com.fourthline.nfc.NfcScannerSecurityKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface kf0 {

    public static final class a implements kf0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f30264b = NfcScannerSecurityKey.$stable;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final NfcScannerSecurityKey f30265a;

        public a(NfcScannerSecurityKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f30265a = key;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f30265a, ((a) obj2).f30265a);
        }

        @Override // com.fourthline.orca.internal.kf0
        public NfcScannerSecurityKey getKey() {
            return this.f30265a;
        }

        public int hashCode() {
            return this.f30265a.hashCode();
        }

        public String toString() {
            return "Idl(key=" + this.f30265a + ")";
        }
    }

    public static final class b implements kf0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f30266b = NfcScannerSecurityKey.$stable;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final NfcScannerSecurityKey f30267a;

        public b(NfcScannerSecurityKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f30267a = key;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f30267a, ((b) obj2).f30267a);
        }

        @Override // com.fourthline.orca.internal.kf0
        public NfcScannerSecurityKey getKey() {
            return this.f30267a;
        }

        public int hashCode() {
            return this.f30267a.hashCode();
        }

        public String toString() {
            return "Mrtd(key=" + this.f30267a + ")";
        }
    }

    NfcScannerSecurityKey getKey();
}
