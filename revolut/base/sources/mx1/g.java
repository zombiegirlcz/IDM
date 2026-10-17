package mx1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.recipients.BrebContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class g {
    public static final BrebContact a(iy1.c cVar, String name) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        String str = cVar.f169587a;
        ApmIdentifier uuid = str != null ? new ApmIdentifier.Uuid(str) : cVar.f169588b;
        ApmDescriptor apmDescriptor = cVar.f169588b;
        String str2 = cVar.d;
        String str3 = cVar.f169589c;
        return new BrebContact(uuid, apmDescriptor, str3 == null ? name : str3, str2, null, cVar.e, cVar.f, null);
    }

    public static final BrebContact b(iy1.c cVar, zm3.g gVar) {
        String name;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (gVar == null || (name = gVar.getName()) == null) {
            name = cVar.f169589c;
        }
        String str = name;
        String str2 = cVar.f169587a;
        ApmDescriptor apmDescriptor = cVar.f169588b;
        return new BrebContact(str2 != null ? new ApmIdentifier.Uuid(str2) : apmDescriptor, apmDescriptor, str, cVar.d, gVar != null ? gVar.c() : null, cVar.e, cVar.f, null);
    }
}
