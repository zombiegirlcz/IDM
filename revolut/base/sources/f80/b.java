package f80;

import android.content.Context;
import android.net.Uri;
import com.revolut.core.model.FileExtension;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import rd0.c;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f132691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0.b f132692b;

    public b(Context context, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f132691a = context;
        this.f132692b = languageProvider;
    }

    public final Uri a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        Uri uriFromFile = Uri.fromFile(file);
        Intrinsics.checkNotNullExpressionValue(uriFromFile, "fromFile(...)");
        return uriFromFile;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r3.equals("tiff") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (r3.equals("jpeg") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        if (r3.equals("tif") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
    
        return com.revolut.core.model.FileExtension.Tiff.f51408b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
    
        if (r3.equals("jpg") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ba, code lost:
    
        return com.revolut.core.model.FileExtension.Jpg.f51404b;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.model.FileExtension b(android.net.Uri r3) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f80.b.b(android.net.Uri):com.revolut.core.model.FileExtension");
    }

    public final FileExtension c(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Uri uri2 = Uri.parse(path);
        Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
        return b(uri2);
    }

    public final File d(Uri uri2) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        String path = uri2.getPath();
        if (path != null) {
            return new File(path);
        }
        return null;
    }

    public final boolean e(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return f(string).isAbsolute();
    }

    public final Uri f(String uri2) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Uri uri3 = Uri.parse(uri2);
        Intrinsics.checkNotNullExpressionValue(uri3, "parse(...)");
        return uri3;
    }

    public final Uri g(String str) {
        if (str != null) {
            try {
                return Uri.parse(str);
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(c.ERROR, null, null, e, h0Var);
            }
        }
        return null;
    }
}
