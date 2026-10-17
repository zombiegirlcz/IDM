package sr8;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f265142a = new f();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Map profiles = (Map) obj2;
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        Collection collectionValues = profiles.values();
        boolean z = false;
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it8 = collectionValues.iterator();
            while (it8.hasNext()) {
                int i = e.f265141a[((JuniorBankingProfile) it8.next()).f77104l.ordinal()];
                if (i == 1 || i == 2 || i == 3 || i == 4) {
                    z = true;
                    break;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
