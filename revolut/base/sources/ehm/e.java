package ehm;

import java.util.Objects;
import vgm.j;
import vgm.t;
import vgm.x;

/* JADX INFO: loaded from: classes14.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f126318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final vgm.e f126319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f126320c;
    public static final x d;

    static {
        RuntimeException runtimeExceptionF;
        try {
            t tVar = d.f126317a;
            Objects.requireNonNull(tVar, "Scheduler Supplier result can't be null");
            f126318a = tVar;
            try {
                vgm.e eVar = a.f126314a;
                Objects.requireNonNull(eVar, "Scheduler Supplier result can't be null");
                f126319b = eVar;
                try {
                    j jVar = b.f126315a;
                    Objects.requireNonNull(jVar, "Scheduler Supplier result can't be null");
                    f126320c = jVar;
                    d = x.f289264c;
                    try {
                        Objects.requireNonNull(c.f126316a, "Scheduler Supplier result can't be null");
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }
}
