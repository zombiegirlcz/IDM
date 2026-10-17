package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes16.dex */
public enum n {
    NOT_AVAILABLE(null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME(null, 5),
    VALUE_EMBEDDED_OBJECT(null, 12),
    VALUE_STRING(null, 6),
    VALUE_NUMBER_INT(null, 7),
    VALUE_NUMBER_FLOAT(null, 8),
    VALUE_TRUE("true", 9),
    VALUE_FALSE("false", 10),
    VALUE_NULL("null", 11);

    final int _id;
    final boolean _isBoolean;
    final boolean _isNumber;
    final boolean _isScalar;
    final boolean _isStructEnd;
    final boolean _isStructStart;
    final String _serialized;
    final byte[] _serializedBytes;
    final char[] _serializedChars;

    n(String str, int i) {
        boolean z = false;
        if (str == null) {
            this._serialized = null;
            this._serializedChars = null;
            this._serializedBytes = null;
        } else {
            this._serialized = str;
            char[] charArray = str.toCharArray();
            this._serializedChars = charArray;
            int length = charArray.length;
            this._serializedBytes = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                this._serializedBytes[i2] = (byte) this._serializedChars[i2];
            }
        }
        this._id = i;
        this._isBoolean = i == 10 || i == 9;
        this._isNumber = i == 7 || i == 8;
        boolean z3 = i == 1 || i == 3;
        this._isStructStart = z3;
        boolean z4 = i == 2 || i == 4;
        this._isStructEnd = z4;
        if (!z3 && !z4 && i != 5 && i != -1) {
            z = true;
        }
        this._isScalar = z;
    }

    public final String a() {
        return this._serialized;
    }

    public final boolean b() {
        return this._isNumber;
    }
}
