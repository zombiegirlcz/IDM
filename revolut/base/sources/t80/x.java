package t80;

import android.net.Uri;
import com.revolut.core.android.utils.file.MissingFileExtensionException;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f80.a f268792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i90.b f268793b;

    public x(f80.a uriHelper, i90.b uuidUtils) {
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        this.f268792a = uriHelper;
        this.f268793b = uuidUtils;
    }

    @Override // t80.g
    public final File a(File directory, Uri pickedFileUri) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(pickedFileUri, "pickedFileUri");
        String f51399a = ((f80.b) this.f268792a).b(pickedFileUri).getF51399a();
        if (f51399a.length() != 0) {
            return new File(directory, com.google.android.gms.internal.mlkit_vision_face.a.o(this.f268793b.a().toString(), ".", f51399a));
        }
        throw new MissingFileExtensionException(a10.b.p(pickedFileUri, "Can't get file extension for "));
    }

    @Override // t80.g
    public final File b(File directory) throws IOException {
        Intrinsics.checkNotNullParameter(directory, "directory");
        File fileCreateTempFile = File.createTempFile(this.f268793b.a().toString(), ".jpg", directory);
        Intrinsics.checkNotNullExpressionValue(fileCreateTempFile, "createTempFile(...)");
        return fileCreateTempFile;
    }
}
