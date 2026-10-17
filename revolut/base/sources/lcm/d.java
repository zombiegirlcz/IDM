package lcm;

import com.google.common.base.Strings;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f193910a = Logger.getLogger(d.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ecm.c f193911b;

    static {
        if (!Strings.isNullOrEmpty(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        f193911b = ecm.c.a("internal-stub-type");
    }
}
