package mx1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class e {
    public static final BizumContact a(jy1.c cVar, String name) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        String str = cVar.f179302a;
        ApmIdentifier uuid = str != null ? new ApmIdentifier.Uuid(str) : cVar.f179303b;
        ApmDescriptor apmDescriptor = cVar.f179303b;
        String str2 = cVar.d;
        String str3 = cVar.f179304c;
        return new BizumContact(uuid, apmDescriptor, str3 == null ? name : str3, str2, null, cVar.e);
    }

    public static final BizumContact b(jy1.c cVar, zm3.f fVar) {
        String str;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (fVar == null || (str = fVar.f323347c) == null) {
            str = cVar.f179304c;
        }
        String str2 = str;
        String str3 = cVar.f179302a;
        return new BizumContact(str3 != null ? new ApmIdentifier.Uuid(str3) : cVar.f179303b, cVar.f179303b, str2, cVar.d, fVar != null ? fVar.f : null, cVar.e);
    }
}
