package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.PermissionInputItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q90.u2;
import q90.x2;

/* JADX INFO: loaded from: classes19.dex */
public final class j0 extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        PermissionInputItem.PermissionValue permissionValue;
        PermissionInputItem.DeclinedPermissionDialog declinedPermissionDialog;
        PermissionInputItem.PermissionPayload metaPermissionPayload;
        u2 item = (u2) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        boolean required = item.getRequired();
        xl2.y yVarValueOf = xl2.y.valueOf(item.getPermission());
        x2 value = item.getValue();
        if (value != null) {
            x2.a payload = value.getPayload();
            if (payload == null) {
                metaPermissionPayload = null;
            } else if (payload instanceof x2.a.C1336a) {
                x2.a.C1336a c1336a = (x2.a.C1336a) payload;
                metaPermissionPayload = new PermissionInputItem.PermissionPayload.LocationPermissionPayload(c1336a.getLongitude(), c1336a.getLatitude(), c1336a.getCountry(), c1336a.getRegion(), c1336a.getCity());
            } else {
                if (!(payload instanceof x2.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                metaPermissionPayload = new PermissionInputItem.PermissionPayload.MetaPermissionPayload(((x2.a.b) payload).getAccessCode());
            }
            permissionValue = new PermissionInputItem.PermissionValue(xl2.x.valueOf(value.getResult()), metaPermissionPayload);
        } else {
            permissionValue = null;
        }
        u2.b declinedPermissionDialog2 = item.getDeclinedPermissionDialog();
        if (declinedPermissionDialog2 != null) {
            String assetUrl = declinedPermissionDialog2.getAssetUrl();
            String title = declinedPermissionDialog2.getTitle();
            String description = declinedPermissionDialog2.getDescription();
            List<u2.a> actions = declinedPermissionDialog2.getActions();
            ArrayList arrayList = new ArrayList(zhm.w.t(actions, 10));
            for (u2.a aVar : actions) {
                arrayList.add(new PermissionInputItem.DeclinedPermissionDialogAction(aVar.getType(), aVar.getTitle()));
            }
            declinedPermissionDialog = new PermissionInputItem.DeclinedPermissionDialog(assetUrl, title, description, arrayList);
        } else {
            declinedPermissionDialog = null;
        }
        return new PermissionInputItem(id10, required, yVarValueOf, permissionValue, declinedPermissionDialog);
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        x2 x2Var;
        u2.b bVar;
        x2.a bVar2;
        PermissionInputItem item = (PermissionInputItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63555a;
        String strName = item.f63557c.name();
        boolean z = item.f63556b;
        PermissionInputItem.PermissionValue permissionValue = item.d;
        if (permissionValue != null) {
            String strName2 = permissionValue.f63567a.name();
            PermissionInputItem.PermissionPayload permissionPayload = permissionValue.f63568b;
            if (permissionPayload != null) {
                String str2 = permissionPayload.f63563a;
                if (permissionPayload instanceof PermissionInputItem.PermissionPayload.LocationPermissionPayload) {
                    PermissionInputItem.PermissionPayload.LocationPermissionPayload locationPermissionPayload = (PermissionInputItem.PermissionPayload.LocationPermissionPayload) permissionPayload;
                    bVar2 = new x2.a.C1336a(locationPermissionPayload.f63564b, locationPermissionPayload.f63565c, str2, locationPermissionPayload.d, locationPermissionPayload.e, locationPermissionPayload.f);
                } else {
                    if (!(permissionPayload instanceof PermissionInputItem.PermissionPayload.MetaPermissionPayload)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar2 = new x2.a.b(str2, ((PermissionInputItem.PermissionPayload.MetaPermissionPayload) permissionPayload).f63566b);
                }
            } else {
                bVar2 = null;
            }
            x2Var = new x2(strName2, bVar2);
        } else {
            x2Var = null;
        }
        PermissionInputItem.DeclinedPermissionDialog declinedPermissionDialog = item.e;
        if (declinedPermissionDialog != null) {
            String str3 = declinedPermissionDialog.f63558a;
            String str4 = declinedPermissionDialog.f63559b;
            String str5 = declinedPermissionDialog.f63560c;
            ArrayList<PermissionInputItem.DeclinedPermissionDialogAction> arrayList = declinedPermissionDialog.d;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
            for (PermissionInputItem.DeclinedPermissionDialogAction declinedPermissionDialogAction : arrayList) {
                arrayList2.add(new u2.a(declinedPermissionDialogAction.f63561a, declinedPermissionDialogAction.f63562b));
            }
            bVar = new u2.b(str3, str4, str5, arrayList2);
        } else {
            bVar = null;
        }
        return new u2(str, z, strName, bVar, x2Var);
    }
}
