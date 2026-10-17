package vqi;

import a0.d;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import gom.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sri.f;
import zhm.d0;
import zhm.t0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends FragmentPagerAdapter {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f291404b;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f291405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f291406h;
    public final LinkedHashMap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f291407j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, FragmentManager fragmentManager, f fragmentProvider) {
        super(fragmentManager, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragmentProvider, "fragmentProvider");
        this.f291404b = context;
        this.f = fragmentProvider;
        this.f291405g = 1L;
        this.f291406h = new LinkedHashMap();
        this.i = new LinkedHashMap();
    }

    public final FragmentNavigateCommand a(int i) {
        FragmentNavigateCommand fragmentNavigateCommand;
        List list = this.f291407j;
        if (list == null || (fragmentNavigateCommand = (FragmentNavigateCommand) list.get(i)) == null) {
            throw new IllegalStateException(d.n("Illegal page index: ", i));
        }
        return fragmentNavigateCommand;
    }

    public final void b(List navigationCommands) {
        Intrinsics.checkNotNullParameter(navigationCommands, "navigationCommands");
        if (Intrinsics.f(this.f291407j, navigationCommands)) {
            return;
        }
        List<FragmentNavigateCommand> list = navigationCommands;
        this.f291407j = d0.d1(list);
        for (FragmentNavigateCommand fragmentNavigateCommand : list) {
            LinkedHashMap linkedHashMap = this.f291406h;
            if (!linkedHashMap.containsKey(fragmentNavigateCommand)) {
                long j2 = this.f291405g;
                this.f291405g = 1 + j2;
                linkedHashMap.put(fragmentNavigateCommand, Long.valueOf(j2));
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup container, int i, Object object) {
        Object next;
        FragmentNavigateCommand fragmentNavigateCommand;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(object, "object");
        super.destroyItem(container, i, object);
        LinkedHashMap linkedHashMap = this.i;
        Iterator it8 = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f(((Map.Entry) next).getValue(), object)) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (fragmentNavigateCommand = (FragmentNavigateCommand) entry.getKey()) == null) {
            return;
        }
        linkedHashMap.remove(fragmentNavigateCommand);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List list = this.f291407j;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public final Fragment getItem(int i) {
        FragmentNavigateCommand fragmentNavigateCommandA = a(i);
        Fragment fragment = (Fragment) this.i.get(fragmentNavigateCommandA);
        if (fragment != null) {
            return fragment;
        }
        Long l2 = (Long) this.f291406h.get(fragmentNavigateCommandA);
        long jLongValue = l2 != null ? l2.longValue() : this.f291405g;
        ClassLoader classLoader = this.f291404b.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        String name = fragmentNavigateCommandA.f98651a.f98650a.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Fragment fragmentE = this.f.e(name, classLoader, String.valueOf(jLongValue));
        Parcelable config = fragmentNavigateCommandA.f98652b;
        if (config != null) {
            Intrinsics.checkNotNullParameter(fragmentE, "<this>");
            Intrinsics.checkNotNullParameter(config, "config");
            Bundle bundle = new Bundle();
            bundle.putParcelable("CONFIGURATION_ARG", config);
            fragmentE.setArguments(bundle);
        }
        return fragmentE;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public final long getItemId(int i) {
        Long l2 = (Long) this.f291406h.get(a(i));
        if (l2 != null) {
            return l2.longValue();
        }
        throw new IllegalStateException(d.n("Illegal item position: ", i));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        Fragment fragment = (Fragment) object;
        int count = getCount();
        for (int i = 0; i < count; i++) {
            if (Intrinsics.f(this.i.get(a(i)), fragment)) {
                return i;
            }
        }
        return -2;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup container, int i) {
        Intrinsics.checkNotNullParameter(container, "container");
        Object objInstantiateItem = super.instantiateItem(container, i);
        Intrinsics.checkNotNullExpressionValue(objInstantiateItem, "instantiateItem(...)");
        this.i.put(a(i), (Fragment) objInstantiateItem);
        return objInstantiateItem;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        try {
            Intrinsics.i(parcelable, "null cannot be cast to non-null type android.os.Bundle");
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(FragmentNavigateCommand.class.getClassLoader());
            super.restoreState(bundle.getParcelable("SUPER_PARCELABLE_KEY"), classLoader);
            this.f291405g = bundle.getLong("GENERATED_ID_KEY");
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("COMMAND_IDS_KEY_KEY");
            long[] longArray = bundle.getLongArray("COMMAND_IDS_VALUE_KEY");
            if (parcelableArrayList != null) {
                int i = 0;
                for (Object obj2 : parcelableArrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    FragmentNavigateCommand fragmentNavigateCommand = (FragmentNavigateCommand) obj2;
                    Long lValueOf = longArray != null ? Long.valueOf(longArray[i]) : null;
                    if (lValueOf != null) {
                        this.f291406h.put(fragmentNavigateCommand, lValueOf);
                    }
                    i = i2;
                }
            }
        } catch (Exception e) {
            e.f145194a.w(e, "Error while restoring a fragment state", new Object[0]);
        }
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public final Parcelable saveState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER_PARCELABLE_KEY", super.saveState());
        bundle.putLong("GENERATED_ID_KEY", this.f291405g);
        List listC = t0.C(this.f291406h);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        List list = listC;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList2.add((FragmentNavigateCommand) ((Pair) it8.next()).f186385a);
        }
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            arrayList3.add(Long.valueOf(((Number) ((Pair) it9.next()).f186386b).longValue()));
        }
        long[] jArrE1 = d0.e1(arrayList3);
        bundle.putParcelableArrayList("COMMAND_IDS_KEY_KEY", arrayList);
        bundle.putLongArray("COMMAND_IDS_VALUE_KEY", jArrE1);
        return bundle;
    }
}
