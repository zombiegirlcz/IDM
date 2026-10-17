package xv0;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends TouchDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f309147a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view) {
        super(new Rect(), view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f309147a = new LinkedHashMap();
    }

    public final void a(String key, TouchDelegate value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f309147a.put(key, value);
    }

    public final void b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f309147a.remove(key);
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent event) {
        Object next;
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator it8 = this.f309147a.values().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((TouchDelegate) next).onTouchEvent(event)) {
                break;
            }
        }
        return next != null;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchExplorationHoverEvent(MotionEvent event) {
        Object next;
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator it8 = this.f309147a.values().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((TouchDelegate) next).onTouchExplorationHoverEvent(event)) {
                break;
            }
        }
        return next != null;
    }
}
