package ec;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import zb.p;

/* JADX INFO: loaded from: classes.dex */
public final class e implements bc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124400a;

    @Override // phm.a
    public final Object get() {
        switch (this.f124400a) {
            case 0:
                ah.a aVar = new ah.a(6);
                HashMap map = new HashMap();
                wb.e eVar = wb.e.DEFAULT;
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(eVar, new fc.b(30000L, CoreConstants.MILLIS_IN_ONE_DAY, set));
                wb.e eVar2 = wb.e.HIGHEST;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(eVar2, new fc.b(1000L, CoreConstants.MILLIS_IN_ONE_DAY, set));
                wb.e eVar3 = wb.e.VERY_LOW;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(fc.c.DEVICE_IDLE)));
                if (setUnmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(eVar3, new fc.b(CoreConstants.MILLIS_IN_ONE_DAY, CoreConstants.MILLIS_IN_ONE_DAY, setUnmodifiableSet));
                if (map.keySet().size() < wb.e.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new fc.a(aVar, map);
            default:
                return new p(Executors.newSingleThreadExecutor());
        }
    }
}
