package mx1;

import com.google.android.material.internal.ViewUtils;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.recipients.QvikContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class k {
    public static final QvikContact a(iy1.h hVar, String name) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        String str = hVar.f169604a;
        ApmDescriptor apmDescriptor = hVar.f169605b;
        ApmIdentifier uuid = str != null ? new ApmIdentifier.Uuid(str) : apmDescriptor;
        String str2 = hVar.d;
        String str3 = hVar.f169606c;
        return new QvikContact(uuid, apmDescriptor, str3 == null ? name : str3, str2, (String) null, hVar.e, hVar.f, hVar.f169607g, (f5j.a) null, ViewUtils.EDGE_TO_EDGE_FLAGS);
    }

    public static final QvikContact b(iy1.h hVar, zm3.g gVar) {
        String name;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        if (gVar == null || (name = gVar.getName()) == null) {
            name = hVar.f169606c;
        }
        String str = name;
        String str2 = hVar.f169604a;
        ApmDescriptor apmDescriptor = hVar.f169605b;
        return new QvikContact(str2 != null ? new ApmIdentifier.Uuid(str2) : apmDescriptor, apmDescriptor, str, hVar.d, gVar != null ? gVar.c() : null, hVar.e, hVar.f, hVar.f169607g, (f5j.a) null, ViewUtils.EDGE_TO_EDGE_FLAGS);
    }
}
