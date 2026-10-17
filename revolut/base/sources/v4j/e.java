package v4j;

import com.revolut.domain.models.beneficiary.ConfirmationResult;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();
    public static final Set e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3j.b f286106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n4j.h f286107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4j.a f286108c;
    public final su9.c d;

    static {
        ConfirmationResult.ResultCode[] elements = {ConfirmationResult.ResultCode.NOT_NEEDED, ConfirmationResult.ResultCode.MATCHED, ConfirmationResult.ResultCode.JOINT_MATCH};
        Intrinsics.checkNotNullParameter(elements, "elements");
        e = kotlin.collections.d.y0(elements);
    }

    public e(d3j.b beneficiaryInteractor, n4j.h fieldDefinitionTransformer, w4j.a creationStateToRequestDataMapper, su9.c beneficiaryDuplicateValidationDelegate) {
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(fieldDefinitionTransformer, "fieldDefinitionTransformer");
        Intrinsics.checkNotNullParameter(creationStateToRequestDataMapper, "creationStateToRequestDataMapper");
        Intrinsics.checkNotNullParameter(beneficiaryDuplicateValidationDelegate, "beneficiaryDuplicateValidationDelegate");
        this.f286106a = beneficiaryInteractor;
        this.f286107b = fieldDefinitionTransformer;
        this.f286108c = creationStateToRequestDataMapper;
        this.d = beneficiaryDuplicateValidationDelegate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
    
        if (r12 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlowContract$CreationProcessState r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4j.e.a(com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlowContract$CreationProcessState, gim.c):java.lang.Object");
    }
}
