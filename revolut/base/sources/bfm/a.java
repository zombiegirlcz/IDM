package bfm;

import com.revolut.ProtectedRevolutApplication;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements yem.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f15035a = Logger.getLogger(a.class.getName());

    @Override // yem.b
    public final InputStream c(String str) {
        InputStream inputStreamA = ProtectedRevolutApplication.a(a.class, str);
        if (inputStreamA == null) {
            f15035a.log(Level.WARNING, "File " + str + " not found");
        }
        return inputStreamA;
    }
}
