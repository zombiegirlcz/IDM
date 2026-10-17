package mx1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.recipients.MultibancoContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class i {
    public static final MultibancoContact a(iy1.e eVar, String name) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        String str = eVar.f169593a;
        ApmIdentifier uuid = str != null ? new ApmIdentifier.Uuid(str) : eVar.f169594b;
        ApmDescriptor.Phone phone = eVar.f169594b;
        String str2 = eVar.f169595c;
        return new MultibancoContact(uuid, phone, str2 == null ? name : str2, eVar.d, null, eVar.e);
    }

    public static final MultibancoContact b(iy1.e eVar, zm3.f fVar) {
        String str;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (fVar == null || (str = fVar.f323347c) == null) {
            str = eVar.f169595c;
        }
        String str2 = str;
        String str3 = eVar.f169593a;
        return new MultibancoContact(str3 != null ? new ApmIdentifier.Uuid(str3) : eVar.f169594b, eVar.f169594b, str2, eVar.d, fVar != null ? fVar.f : null, eVar.e);
    }
}
