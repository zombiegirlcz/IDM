package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public abstract class w81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f34548c;
    private final int d;
    private final int e;
    private final int f;

    public static final class a extends w81 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f34549g = new a();

        private a() {
            super(R.string.step_tin_details_label_tin_esp, R.string.step_tin_details_hint_esp, R.string.step_tin_details_validation_invalid_tin_esp, R.string.shared_validation_invalid_length_NIE_number_accessibility, R.string.shared_validation_required_NIE_number_accessibility, R.string.shared_validation_invalid_NIE_number_accessibility, null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return 1948464268;
        }

        public String toString() {
            return "ESP";
        }
    }

    public static final class b extends w81 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f34550g = new b();

        private b() {
            super(R.string.step_tin_details_label_tin_ita, R.string.step_tin_details_hint_ita, R.string.step_tin_details_validation_invalid_tin_ita, R.string.shared_validation_invalid_length_codice_fiscale_number_accessibility, R.string.shared_validation_required_codice_fiscal_number_accessibility, R.string.shared_validation_invalid_codice_fiscal_number_accessibility, null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return 1948468128;
        }

        public String toString() {
            return "ITA";
        }
    }

    public static final class c extends w81 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final DocumentType f34551g;

        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DocumentType.values().length];
                try {
                    iArr[DocumentType.RESIDENCE_PERMIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public c(DocumentType documentType) {
            super(R.string.step_tin_details_label_tin_nld, (documentType == null ? -1 : a.$EnumSwitchMapping$0[documentType.ordinal()]) == 1 ? R.string.step_tin_details_rp_hint_nld : R.string.step_tin_details_hint_nld, R.string.step_tin_details_validation_invalid_tin_nld, R.string.shared_validation_invalid_length_BSN_number_accessibility, R.string.shared_validation_required_BSN_number_accessibility, R.string.shared_validation_invalid_BSN_number_accessibility, null);
            this.f34551g = documentType;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && this.f34551g == ((c) obj2).f34551g;
        }

        public int hashCode() {
            DocumentType documentType = this.f34551g;
            if (documentType == null) {
                return 0;
            }
            return documentType.hashCode();
        }

        public String toString() {
            return "NLD(documentType=" + this.f34551g + ")";
        }
    }

    public /* synthetic */ w81(int i, int i2, int i3, int i5, int i6, int i21, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i5, i6, i21);
    }

    public final int a() {
        return this.f34547b;
    }

    public final int b() {
        return this.f;
    }

    public final int c() {
        return this.d;
    }

    public final int d() {
        return this.f34548c;
    }

    public final int e() {
        return this.e;
    }

    public final int f() {
        return this.f34546a;
    }

    private w81(int i, int i2, int i3, int i5, int i6, int i21) {
        this.f34546a = i;
        this.f34547b = i2;
        this.f34548c = i3;
        this.d = i5;
        this.e = i6;
        this.f = i21;
    }
}
