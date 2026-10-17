package pl;

import com.onfido.api.client.data.DocumentMediaUploadResponse;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
public final class n implements igm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f237236a;

    public n(ArrayList arrayList) {
        this.f237236a = arrayList;
    }

    @Override // igm.o
    public final Object apply(Object obj2) {
        DocumentMediaUploadResponse documentMediaUpload = (DocumentMediaUploadResponse) obj2;
        Intrinsics.checkNotNullParameter(documentMediaUpload, "documentMediaUpload");
        return new l(d0.F0(new ml.g(documentMediaUpload.mediaId(), ml.f.DOCUMENT_NFC), this.f237236a));
    }
}
