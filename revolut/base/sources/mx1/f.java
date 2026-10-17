package mx1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.recipients.BlikContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class f {
    public static final BlikContact a(iy1.b bVar, String name) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        String str = bVar.f169584a;
        ApmIdentifier uuid = str != null ? new ApmIdentifier.Uuid(str) : bVar.f169585b;
        ApmDescriptor.Phone phone = bVar.f169585b;
        String str2 = bVar.f169586c;
        return new BlikContact(uuid, phone, str2 == null ? name : str2, bVar.d, null, bVar.e);
    }

    public static final BlikContact b(iy1.b bVar, zm3.f fVar) {
        String str;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (fVar == null || (str = fVar.f323347c) == null) {
            str = bVar.f169586c;
        }
        String str2 = str;
        String str3 = bVar.f169584a;
        return new BlikContact(str3 != null ? new ApmIdentifier.Uuid(str3) : bVar.f169585b, bVar.f169585b, str2, bVar.d, fVar != null ? fVar.f : null, bVar.e);
    }
}
