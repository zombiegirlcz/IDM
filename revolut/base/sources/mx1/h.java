package mx1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.recipients.IdentityType;
import com.revolut.feature.apm.core.models.recipients.IrisContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class h {
    public static final IrisContact a(iy1.d dVar, String name) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        String str = dVar.f169590a;
        ApmDescriptor apmDescriptor = dVar.f169591b;
        ApmIdentifier uuid = str != null ? new ApmIdentifier.Uuid(str) : apmDescriptor;
        String str2 = dVar.f169592c;
        return new IrisContact(uuid, apmDescriptor, str2 == null ? name : str2, dVar.d, null, dVar.e, IdentityType.Companion.a(IdentityType.INSTANCE, dVar.f));
    }

    public static final IrisContact b(iy1.d dVar, zm3.f fVar) {
        String str;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (fVar == null || (str = fVar.f323347c) == null) {
            str = dVar.f169592c;
        }
        String str2 = str;
        String str3 = dVar.f169590a;
        ApmDescriptor apmDescriptor = dVar.f169591b;
        return new IrisContact(str3 != null ? new ApmIdentifier.Uuid(str3) : apmDescriptor, apmDescriptor, str2, dVar.d, fVar != null ? fVar.f : null, dVar.e, IdentityType.Companion.a(IdentityType.INSTANCE, dVar.f));
    }
}
