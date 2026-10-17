package aa0;

import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.PermissionInputItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        PermissionInputItem targetItem = (PermissionInputItem) inputItem;
        PermissionInputItem.PermissionValue updatedValue = (PermissionInputItem.PermissionValue) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        return PermissionInputItem.d(targetItem, updatedValue);
    }
}
