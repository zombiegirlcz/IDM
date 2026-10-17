package mx1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.recipients.PixContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class j {
    public static final PixContact a(iy1.f fVar, String name) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        String str = fVar.f169596a;
        ApmIdentifier uuid = str != null ? new ApmIdentifier.Uuid(str) : fVar.f169597b;
        ApmDescriptor apmDescriptor = fVar.f169597b;
        String str2 = fVar.e;
        String str3 = fVar.f169598c;
        return new PixContact(uuid, apmDescriptor, str3 == null ? name : str3, str2, null, fVar.d, fVar.f, null, fVar.f169599g, fVar.f169600h, fVar.i, fVar.f169601j);
    }

    public static final PixContact b(iy1.f fVar, zm3.g gVar) {
        String name;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (gVar == null || (name = gVar.getName()) == null) {
            name = fVar.f169598c;
        }
        String str = name;
        String str2 = fVar.f169596a;
        ApmDescriptor apmDescriptor = fVar.f169597b;
        return new PixContact(str2 != null ? new ApmIdentifier.Uuid(str2) : apmDescriptor, apmDescriptor, str, fVar.e, gVar != null ? gVar.c() : null, fVar.d, fVar.f, null, fVar.f169599g, fVar.f169600h, fVar.i, fVar.f169601j);
    }
}
