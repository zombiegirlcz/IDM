package sii;

import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Permission;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Boolean.valueOf(((PermissionsFlowContract$Permission) obj2).f98348b instanceof PermissionsFlowContract$Explanation.None), Boolean.valueOf(((PermissionsFlowContract$Permission) obj3).f98348b instanceof PermissionsFlowContract$Explanation.None));
    }
}
