package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.Gender;
import com.fourthline.orca.workflow.WorkflowResults;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes23.dex */
public abstract class hj {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[rc1.values().length];
            try {
                iArr[rc1.f32690b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rc1.f32689a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rc1.f32691c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rc1.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rc1.i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Gender a(gg0 gg0Var) {
        String gender = gg0Var != null ? gg0Var.getGender() : null;
        return Intrinsics.f(gender, "Male") ? Gender.MALE : Intrinsics.f(gender, "Female") ? Gender.FEMALE : Gender.UNKNOWN;
    }

    public static final Pair b(gj gjVar) {
        Intrinsics.checkNotNullParameter(gjVar, "<this>");
        gh ghVarF = gjVar.f();
        byte[] bArrH = gjVar.h();
        if (bArrH == null) {
            bArrH = new byte[0];
        }
        return qc1.a(ghVarF, bArrH);
    }

    public static final Pair c(gj gjVar) {
        Intrinsics.checkNotNullParameter(gjVar, "<this>");
        gh ghVarF = gjVar.f();
        String strB = gjVar.b();
        fd fdVarG = gjVar.g();
        return qc1.a(ghVarF, strB, fdVarG != null ? fdVarG.c() : null);
    }

    public static final Pair a(gj gjVar) {
        Intrinsics.checkNotNullParameter(gjVar, "<this>");
        return qc1.b(gjVar.f());
    }

    public static final i10 a(gj gjVar, String workflowId, rc1 idvPart) {
        Pair pairA;
        Intrinsics.checkNotNullParameter(gjVar, "<this>");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(idvPart, "idvPart");
        int i = a.$EnumSwitchMapping$0[idvPart.ordinal()];
        if (i == 1) {
            Pair pairB = b(gjVar);
            if (pairB != null) {
                return new i10(idvPart, new ur(workflowId, (List) pairB.f186386b), (WorkflowResults.IDV.DocumentVideo) pairB.f186385a);
            }
            return null;
        }
        if (i == 2) {
            Pair pairC = c(gjVar);
            if (pairC == null) {
                return null;
            }
            WorkflowResults.IDV.Document document = (WorkflowResults.IDV.Document) pairC.f186385a;
            br brVar = (br) pairC.f186386b;
            String strB = gjVar.b();
            if (strB != null) {
                Json jsonA = s40.a();
                jsonA.getClass();
                return new i10(idvPart, new pi(workflowId, strB, jsonA.c(br.INSTANCE.serializer(), brVar)), document);
            }
            wz.a("DocumentId is not available.");
            throw new KotlinNothingValueException();
        }
        if (i == 3) {
            Pair pairA2 = a(gjVar);
            if (pairA2 != null) {
                return new i10(idvPart, new lm(workflowId, (List) pairA2.f186386b), (WorkflowResults.IDV.Nfc) pairA2.f186385a);
            }
            return null;
        }
        if (i != 4) {
            if (i == 5 && (pairA = qc1.a(gjVar.n(), DocumentType.PROOF_OF_ADDRESS)) != null) {
                return new i10(idvPart, new op0(workflowId, (List) pairA.f186386b), (WorkflowResults.IDV.SecondaryDocument) pairA.f186385a);
            }
            return null;
        }
        Pair pairA3 = qc1.a(gjVar.n(), DocumentType.TIN_REFERENCE_DOCUMENT);
        if (pairA3 != null) {
            return new i10(idvPart, new u71(workflowId, (List) pairA3.f186386b), (WorkflowResults.IDV.SecondaryDocument) pairA3.f186385a);
        }
        return null;
    }
}
