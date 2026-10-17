package com.revolut.feature.apm.core.ui.impl.ui.qr.common;

import e60.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n32.e;
import n32.f;
import t80.m;
import t80.o;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0002\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/apm/core/ui/impl/ui/qr/common/QrFileDetectorInteractor$Result$Error", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ln32/e;", "MediaPicker", "BarcodeFile", "Lcom/revolut/feature/apm/core/ui/impl/ui/qr/common/QrFileDetectorInteractor$Result$Error$BarcodeFile;", "Lcom/revolut/feature/apm/core/ui/impl/ui/qr/common/QrFileDetectorInteractor$Result$Error$MediaPicker;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class QrFileDetectorInteractor$Result$Error extends RuntimeException implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f62363a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/qr/common/QrFileDetectorInteractor$Result$Error$BarcodeFile;", "Lcom/revolut/feature/apm/core/ui/impl/ui/qr/common/QrFileDetectorInteractor$Result$Error;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BarcodeFile extends QrFileDetectorInteractor$Result$Error {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zq2.e f62364b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BarcodeFile(zq2.e error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            f.Companion.getClass();
            Intrinsics.checkNotNullParameter(error, "<this>");
            this.f62364b = error;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BarcodeFile) && Intrinsics.f(this.f62364b, ((BarcodeFile) obj2).f62364b);
        }

        public final int hashCode() {
            return this.f62364b.f324350a.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/qr/common/QrFileDetectorInteractor$Result$Error$MediaPicker;", "Lcom/revolut/feature/apm/core/ui/impl/ui/qr/common/QrFileDetectorInteractor$Result$Error;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MediaPicker extends QrFileDetectorInteractor$Result$Error {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f62365b;

        /* JADX WARN: Illegal instructions before constructor call */
        public MediaPicker(j error) {
            Intrinsics.checkNotNullParameter(error, "error");
            f.Companion.getClass();
            Intrinsics.checkNotNullParameter(error, "<this>");
            m mVar = error.f122857a;
            o oVar = mVar instanceof o ? (o) mVar : null;
            super(oVar != null ? oVar.f268773a : null);
            this.f62365b = error;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MediaPicker) && Intrinsics.f(this.f62365b, ((MediaPicker) obj2).f62365b);
        }

        public final int hashCode() {
            return this.f62365b.hashCode();
        }
    }

    public QrFileDetectorInteractor$Result$Error(Throwable th10) {
        this.f62363a = th10;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f62363a;
    }
}
