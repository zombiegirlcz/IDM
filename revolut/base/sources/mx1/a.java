package mx1;

import com.revolut.feature.apm.core.models.recipients.AaniContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public static final AaniContact a(iy1.a aVar, String name) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        String str = aVar.f169581a;
        ApmIdentifier uuid = str != null ? new ApmIdentifier.Uuid(str) : aVar.f169582b;
        ApmDescriptor apmDescriptor = aVar.f169582b;
        String str2 = aVar.f169583c;
        return new AaniContact(uuid, apmDescriptor, str2 == null ? name : str2, aVar.d, null, aVar.e, aVar.f);
    }

    public static final AaniContact b(iy1.a aVar, zm3.g gVar) {
        String name;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (gVar == null || (name = gVar.getName()) == null) {
            name = aVar.f169583c;
        }
        String str = name;
        String str2 = aVar.f169581a;
        ApmDescriptor apmDescriptor = aVar.f169582b;
        return new AaniContact(str2 != null ? new ApmIdentifier.Uuid(str2) : apmDescriptor, apmDescriptor, str, aVar.d, gVar != null ? gVar.c() : null, aVar.e, aVar.f);
    }
}
