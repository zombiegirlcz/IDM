package com.fourthline.orca.kyc.internal.error;

import com.fourthline.orca.internal.er;
import com.fourthline.orca.internal.si;
import com.fourthline.orca.kyc.internal.error.KycError;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\"\u0018\u0010\b\u001a\u00020\u0001*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/fourthline/orca/internal/er;", "Lcom/fourthline/orca/kyc/internal/error/KycError;", "postProcessingErrorToKycError", "(Lcom/fourthline/orca/internal/er;)Lcom/fourthline/orca/kyc/internal/error/KycError;", "documentAnalysisErrorToKycError", "Lcom/fourthline/orca/internal/si;", "getKycError", "(Lcom/fourthline/orca/internal/si;)Lcom/fourthline/orca/kyc/internal/error/KycError;", "kycError", "fourthline-sdk_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class KycErrorKt {
    @NotNull
    public static final KycError documentAnalysisErrorToKycError(@NotNull er erVar) {
        Intrinsics.checkNotNullParameter(erVar, "<this>");
        if (!Intrinsics.f(erVar, er.g.f28242a) && !Intrinsics.f(erVar, er.f.f28240a)) {
            if (Intrinsics.f(erVar, er.e.f28238a)) {
                return KycError.DocumentTypeNotSupported.INSTANCE;
            }
            if (Intrinsics.f(erVar, er.i.f28246a)) {
                return KycError.NationalityNotSupported.INSTANCE;
            }
            if (Intrinsics.f(erVar, er.a.f28230a)) {
                return KycError.DocumentExpired.INSTANCE;
            }
            if (Intrinsics.f(erVar, er.j.f28248a)) {
                return KycError.PersonNotAdult.INSTANCE;
            }
            if (Intrinsics.f(erVar, er.d.f28236a)) {
                return KycError.DocumentTypeInvalid.INSTANCE;
            }
            if (Intrinsics.f(erVar, er.c.f28234a)) {
                throw new IllegalStateException("FL developer error! This error is always recoverable!");
            }
            if (Intrinsics.f(erVar, er.b.f28232a)) {
                throw new IllegalStateException("FL developer error! This error is always recoverable!");
            }
            if (Intrinsics.f(erVar, er.h.f28244a)) {
                throw new IllegalStateException("FL developer error! This error is always recoverable!");
            }
            throw new NoWhenBranchMatchedException();
        }
        return KycError.IssuingCountryNotSupported.INSTANCE;
    }

    @NotNull
    public static final KycError getKycError(@NotNull si siVar) {
        Intrinsics.checkNotNullParameter(siVar, "<this>");
        if (siVar instanceof si.c) {
            return KycError.Canceled.INSTANCE;
        }
        if (siVar instanceof si.e) {
            return postProcessingErrorToKycError(((si.e) siVar).a());
        }
        if (siVar instanceof si.a) {
            return documentAnalysisErrorToKycError(((si.a) siVar).a());
        }
        if (siVar instanceof si.g) {
            si.g gVar = (si.g) siVar;
            return KycError.Unexpected.INSTANCE.create(gVar.getMessage(), gVar.getCause());
        }
        if (!(siVar instanceof si.d) && !(siVar instanceof si.f) && !(siVar instanceof si.b)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException((siVar + " error has to be handled by Document Scanner and cannot be mapped!").toString());
    }

    @NotNull
    public static final KycError postProcessingErrorToKycError(@NotNull er erVar) {
        Intrinsics.checkNotNullParameter(erVar, "<this>");
        if (Intrinsics.f(erVar, er.a.f28230a)) {
            return KycError.DocumentExpired.INSTANCE;
        }
        if (Intrinsics.f(erVar, er.e.f28238a)) {
            return KycError.DocumentTypeNotSupported.INSTANCE;
        }
        if (Intrinsics.f(erVar, er.d.f28236a)) {
            return KycError.DocumentTypeInvalid.INSTANCE;
        }
        if (Intrinsics.f(erVar, er.g.f28242a)) {
            return KycError.IssuingCountryNotSupported.INSTANCE;
        }
        er.i iVar = er.i.f28246a;
        if (Intrinsics.f(erVar, iVar)) {
            return KycError.NationalityNotSupported.INSTANCE;
        }
        if (Intrinsics.f(erVar, er.j.f28248a)) {
            return KycError.PersonNotAdult.INSTANCE;
        }
        if (!Intrinsics.f(erVar, er.f.f28240a) && !Intrinsics.f(erVar, iVar) && !Intrinsics.f(erVar, er.c.f28234a) && !Intrinsics.f(erVar, er.b.f28232a) && !Intrinsics.f(erVar, er.h.f28244a)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Product doesn't support " + erVar + " for PostProcessing use-cases at this moment.").toString());
    }
}
