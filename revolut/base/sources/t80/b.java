package t80;

import android.database.Cursor;
import android.net.Uri;
import com.revolut.core.android.utils.file.InvalidFileNameException;
import com.revolut.core.android.utils.file.MissingFileExtensionException;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements g {

    @NotNull
    public static final a Companion = new a();
    public static final DateTimeFormatter d = DateTimeFormat.forPattern("yyMMddHHmmss");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f80.a f268758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f268759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zk0.b f268760c;

    public b(f80.a uriHelper, l80.e dateProvider, zk0.b fileRepository) {
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(fileRepository, "fileRepository");
        this.f268758a = uriHelper;
        this.f268759b = dateProvider;
        this.f268760c = fileRepository;
    }

    @Override // t80.g
    public final File a(File directory, Uri uri2) throws IOException {
        String string;
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(uri2, "pickedFileUri");
        f80.b bVar = (f80.b) this.f268758a;
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Cursor cursorQuery = bVar.f132691a.getContentResolver().query(uri2, null, null, null, null);
        if (cursorQuery != null) {
            try {
                int columnIndex = cursorQuery.getColumnIndex("_display_name");
                cursorQuery.moveToFirst();
                string = cursorQuery.getString(columnIndex);
                if (string == null) {
                    cursorQuery.close();
                    string = null;
                } else {
                    if (d0.K(string, '/') || d0.J(string, "..", false)) {
                        throw new InvalidFileNameException();
                    }
                    if (string.length() == 0) {
                        string = null;
                    }
                    cursorQuery.close();
                }
            } finally {
            }
        } else {
            string = null;
        }
        if (string == null) {
            String strPrint = d.print(((l80.f) this.f268759b).g());
            Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
            String f51399a = bVar.b(uri2).getF51399a();
            String str = f51399a.length() > 0 ? f51399a : null;
            if (str == null) {
                throw new MissingFileExtensionException(a10.b.p(uri2, "Can't get file extension for "));
            }
            string = a0.d.s("DOC_", strPrint, ".", str);
        }
        File fileC = ((a80.h) this.f268760c).c(directory, string);
        if (Intrinsics.f(fileC.getParentFile(), directory)) {
            return fileC;
        }
        throw new IllegalArgumentException(j6.a.q("File has invalid directory: ", fileC.getCanonicalPath()));
    }

    @Override // t80.g
    public final File b(File directory) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        String strPrint = d.print(((l80.f) this.f268759b).g());
        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
        return ((a80.h) this.f268760c).c(directory, p.a.p("IMG_", strPrint, ".jpg"));
    }
}
