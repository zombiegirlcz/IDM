package com.github.devnied.emvnfccard.model;

import java.io.Serializable;
import ymm.h;
import zmm.a;
import zmm.d;

/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractData implements Serializable {
    private static final d CUSTOM_STYLE = new CustomToStringStyle();
    public static final int UNKNOWN = -1;
    private static final long serialVersionUID = -456811026151402726L;

    public static final class CustomToStringStyle extends d {
        private static final long serialVersionUID = 1;

        public CustomToStringStyle() {
            setUseShortClassName(true);
            setUseIdentityHashCode(false);
            setContentStart("[");
            StringBuilder sb6 = new StringBuilder();
            String str = h.f315068b;
            sb6.append(str);
            sb6.append("  ");
            setFieldSeparator(sb6.toString());
            setFieldSeparatorAtStart(true);
            setContentEnd(str + "]");
        }
    }

    public String toString() {
        return new a(this, CUSTOM_STYLE).toString();
    }
}
