package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.ContextExtensionsKt;
import com.fourthline.orca.internal.cw0;
import com.fourthline.orca.internal.dw0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public abstract class h61 {
    public static /* synthetic */ g61 a(Context context, long j2, int i, Object obj2) {
        if ((i & 2) != 0) {
            j2 = 1000;
        }
        return a(context, j2);
    }

    private static final List b(String str) {
        return zhm.v.k(new dw0.b.a.C0189b("1", "Agreement #1", str), new dw0.b.a.C0189b("2", "Agreement #2", str), new dw0.b.a.C0189b("3", "Agreement #3", str));
    }

    public static final g61 a(Context context, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(ContextExtensionsKt.getFourthlineDirectory(context).getPath(), "stub_file_used_for_all_docs.pdf");
        file.createNewFile();
        file.deleteOnExit();
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(context.getResources().getIdentifier("qes_sample_doc", "raw", context.getPackageName()));
        try {
            Intrinsics.h(inputStreamOpenRawResource);
            lim.m.g(file, zi0.c.H(inputStreamOpenRawResource));
            Unit unit = Unit.f186387a;
            inputStreamOpenRawResource.close();
            String absolutePath = file.getAbsolutePath();
            m.Companion companion = yhm.m.INSTANCE;
            Intrinsics.h(absolutePath);
            return new g61(new dw0.b(new dw0.b.a("+31 6******94", b(absolutePath), a(absolutePath), zhm.v.k(new cw0.a.C0180a.C0181a("A1", "By checking this box, I confirm that my personal data as provided by me and included in the Activation Application, which I have read, are true and accurate and that I am aware that any false statements shall be punishable under applicable criminal law provisions.", 1), new cw0.a.C0180a.C0181a("A2", "I am aware that the Service will be performed immediately and I therefore accept that I may not withdraw from the Contract, in accordance with the Consumer Code and the Terms and Conditions of the Service.", 1)), new cw0.a.C0180a.c("numerical", 6))), j2);
        } finally {
        }
    }

    private static final List a(String str) {
        return zhm.v.k(new dw0.b.a.C0188a("tac.pdf", "Terms and Conditions", str, "/v1/tac.pdf", 2), new dw0.b.a.C0188a("ps.pdf", "Privacy Statement", str, "/v1/ps.pdf", 2));
    }
}
