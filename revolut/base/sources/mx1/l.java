package mx1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.recipients.SpinContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class l {
    public static final SpinContact a(iy1.i iVar, String name) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        String str = iVar.f169608a;
        ApmDescriptor apmDescriptor = iVar.f169609b;
        ApmIdentifier uuid = str != null ? new ApmIdentifier.Uuid(str) : apmDescriptor;
        String str2 = iVar.f169610c;
        return new SpinContact(uuid, apmDescriptor, str2 == null ? name : str2, iVar.d, null, iVar.e, null);
    }

    public static final SpinContact b(iy1.i iVar, zm3.f fVar) {
        String str;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        if (fVar == null || (str = fVar.f323347c) == null) {
            str = iVar.f169610c;
        }
        String str2 = str;
        String str3 = iVar.f169608a;
        ApmDescriptor apmDescriptor = iVar.f169609b;
        return new SpinContact(str3 != null ? new ApmIdentifier.Uuid(str3) : apmDescriptor, apmDescriptor, str2, iVar.d, fVar != null ? fVar.f : null, iVar.e, null);
    }
}
