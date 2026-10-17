package d4f;

import com.revolut.core.model.FileExtension;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements ybl.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hk0.a f111283a;

    public e(hk0.a networkFileRepository) {
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        this.f111283a = networkFileRepository;
    }

    public final ufm.n a(String url2, ybl.e fileExtension) {
        FileExtension fileExtension2;
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(fileExtension, "fileExtension");
        int i = d.f111282a[fileExtension.ordinal()];
        if (i == 1) {
            fileExtension2 = FileExtension.Pdf.f51406b;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fileExtension2 = FileExtension.Csv.f51401b;
        }
        return this.f111283a.b(url2, true, fileExtension2);
    }
}
