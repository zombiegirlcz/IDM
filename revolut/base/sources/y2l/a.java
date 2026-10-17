package y2l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.legacy_ui.R$id;
import com.revolut.retail.legacy_ui.R$layout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayoutInflater f310677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f310678b;

    public a(BaseDelegatesActivity baseDelegatesActivity, ArrayList arrayList) {
        this.f310678b = arrayList;
        this.f310677a = LayoutInflater.from(baseDelegatesActivity);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayList = this.f310678b;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        ArrayList arrayList = this.f310678b;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (String) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f310677a.inflate(R$layout.dialog_choice_item_blue, viewGroup, false);
        }
        ((TextView) view.findViewById(R$id.item_text)).setText((String) this.f310678b.get(i));
        return view;
    }
}
