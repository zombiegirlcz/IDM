package mx1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.recipients.WeroContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class m {
    public static final WeroContact a(iy1.j jVar, String name) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        String str = jVar.f169611a;
        ApmDescriptor apmDescriptor = jVar.f169612b;
        ApmIdentifier uuid = str != null ? new ApmIdentifier.Uuid(str) : apmDescriptor;
        String str2 = jVar.d;
        String str3 = jVar.f169613c;
        return new WeroContact(uuid, apmDescriptor, str3 == null ? name : str3, str2, null, jVar.e, jVar.f, null);
    }

    public static final WeroContact b(iy1.j jVar, zm3.g gVar) {
        String name;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (gVar == null || (name = gVar.getName()) == null) {
            name = jVar.f169613c;
        }
        String str = name;
        String str2 = jVar.f169611a;
        ApmDescriptor apmDescriptor = jVar.f169612b;
        return new WeroContact(str2 != null ? new ApmIdentifier.Uuid(str2) : apmDescriptor, apmDescriptor, str, jVar.d, gVar != null ? gVar.c() : null, jVar.e, jVar.f, null);
    }
}
